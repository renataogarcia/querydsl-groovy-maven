package sample

import com.querydsl.jpa.impl.JPAQueryFactory

import javax.persistence.EntityManager

import static sample.QFoo.foo

class FooRepository {

    @Delegate
    final JPAQueryFactory queryFactory

    FooRepository(EntityManager entityManager) {
        this.queryFactory = new JPAQueryFactory(entityManager)
    }

    Foo findOne(Long id) {
        return selectFrom(foo)
            .where(foo.id.eq(id))
            .fetchFirst()
    }
}
