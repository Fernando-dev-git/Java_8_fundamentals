package funcional.interfaces;

public class LambdaFunctionTest {
	
	public void miMetodo(FunctionTest functionTest) {
		functionTest.Saludar();
	}

	public static void main(String[] args) {
		FunctionTest ft = () -> System.out.println("Hello World");
		
		FunctionTest ftEs = () -> System.out.println("Hola Mundo");
		
		LambdaFunctionTest object = new LambdaFunctionTest();
		object.miMetodo(ft);
		object.miMetodo(ftEs);
	}

}
