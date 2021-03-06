package adapter.robot;

// 기존 로봇 기능에, 다른 회사에서 만든 달리기 기능을 추가!!


public class MyProgram { 	
	
  public static void main(String[] args) {
    RobotKit robotKit = new RobotKit();

    robotKit.addCommand(new MoveForwardCommand(2));
    robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
    robotKit.addCommand(new MoveForwardCommand(1));
    robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));
    robotKit.addCommand(new PickupCommand());

    robotKit.addCommand(
		new CommandOrderAdapter(
				new MoveBackOrder(1)
		)
    );
    
    robotKit.start();

    // 2 칸 전진
    // 왼쪽으로 방향전환
    // 1 칸 전진
    // 오른쪽으로 방향전환
    // 앞의 물건 집어들기
  }
  
  

}