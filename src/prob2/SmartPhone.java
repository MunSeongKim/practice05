package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if( function.equals("앱") ){
			execApp();
			return ;
		}
		
		super.execute(function);
	}
	
	private void execApp(){
		System.out.println("앱실행");
	}
	
}
