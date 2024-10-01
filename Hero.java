
public class Hero implements HeroInterface {
	private String jobName;
	private Job job;



@Override
public int getSTR() {
	return 20;

}


@Override
public int getINT() {
	return 20;

}

@Override
public int getDEX() {
	return 20;

}

@Override
public String getRaceName() {
	return "";

}
@Override
public String getJobName() {
	return "";

}

@Override
public int attack(int val) {
	return job.attack(val);
}
}