import com.vehicle.*;

class MyCar extends Car {}
class MyBus extends Bus {}
public class PackageTest {
	public static void main(String args[]) {
		Bus bus = new Bus();
		Car car = new Car(); //컴파일 에러
	}
}
