package p06.textbook.s061504;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		// 서비스 클래스로 부터 매소드를 얻음
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		// 메소드 객체를 하나씩 처리
		for(Method method :declaredMethods) {
			// 프린트 어노테이션 적용 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//프린트 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.println(method.getName());
				//구분선출력
				for(int i = 0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());;
				}
				System.out.println();
				
				try {
					//메소드 호출
					method. invoke(new Service());
				}catch (Exception e) {
					System.out.println();
					// TODO: handle exception
				}
			}
		}
		
	}
}
