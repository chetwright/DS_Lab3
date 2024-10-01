public class Robot extends Hero {
	private String jobName;
	private Job job;



@Override
public int getSTR() {
	return 20;
}

@Override
public int getINT() {
	return 25;

}

@Override
public int getDEX() {
	return 20;
}

@Override
public String getRaceName() {
	return "ROBOT";

}
@Override
public int attack(int val) {
	attack = Job.attack(val);

}
}