package club.lunarcat.utils;

/**
 * 用于记录日志的工具类，它里面提供了公共的代码
 * @aothor cds
 * @create 2019/10/10 - 20:08
 */
public class Logger {
	/**
	 * 用于打印日志：计划让其在切入点方法执行之前执行（切入点方法就是业务层方法）
	 */
	public  void printLog(){
		System.out.println("Logger类中的pringLog方法开始记录日志了。。。");
	}

	/**
	 * 前置通知
	 */
	public  void beforePrintLog(){
		System.out.println("前置通知Logger类中的beforePrintLog方法开始记录日志了。。。");
	}

	/**
	 * 后置通知
	 */
	public  void afterReturningPrintLog(){
		System.out.println("后置通知Logger类中的afterReturningPrintLog方法开始记录日志了。。。");
	}
	/**
	 * 异常通知
	 */
	public  void afterThrowingPrintLog(){
		System.out.println("异常通知Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
	}

	/**
	 * 最终通知
	 */
	public  void afterPrintLog(){
		System.out.println("最终通知Logger类中的afterPrintLog方法开始记录日志了。。。");
	}
}
