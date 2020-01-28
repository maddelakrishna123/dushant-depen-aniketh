import java.util.Scanner;

public class PlayerDemo {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
  System.out.println("Enter Player Id");
  
  int id  = sc.nextInt();
  System.out.println("Enter Player Name :");
  String name = sc.next();
  System.out.println("Enter Score");
  int score = sc.nextInt();
		
		Player p = new Player(); // 0 null, 0
		p.setId(id);
		p.setName(name);

		p.setScore(score);
		
		
		
		//     123   score + bonus (2)
		if(p.getId() == 123)
		{
			
			int newScore = p.getScore() + 2;
			
			p.setScore(newScore);  // method call
		}
	   
		// getMethod

		
		
		
	}

}


// encapuslation -> wraping or binding data and methods into single unit

// provide  security to data , by hiding data from out side