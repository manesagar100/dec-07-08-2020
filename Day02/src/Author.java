import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

//@Repeatable
@Target(ElementType.TYPE)
public @interface Author {
	String name();
}
