
public class Player {

	private int id;
	private String name;
	private int score;
	private String address;
	
	private String gender;
	
	

	//
	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Player()
	{
		
	}

	Player(int id, String name, int score,String address) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.address = address;
	}
	
	

	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void diplayPlayerInfo() {
		System.out.println(id + " " + name + " " + score);
	}
}

// gmail -  your data   //  is 