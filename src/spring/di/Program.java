package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewLecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewLecExam();
		ExamConsole console = new GridExamConsole(exam); // DI
		
		console.setExam(exam);
		*/
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		
		//ExamConsole console = (ExamConsole) context.getBean("console"); // 오브젝트형을 받기때문에 형식변환 해줘야함(ExamConsole)로
		ExamConsole console = context.getBean(ExamConsole.class); // 오브젝트형을 받기때문에 형식변환 해줘야함(ExamConsole)로
		console.print();
	}
}
