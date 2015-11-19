package sample

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Foo {

	@Id
	Long id

	String bar
}
