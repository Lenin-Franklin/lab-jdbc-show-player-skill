package model;

public class Skill
{
	private long skilld;
	private String skillName;
	
	public long getSkilld()
	{
		return skilld;
	}
	public String getSkillName()
	{
		return skillName;
	}
	public void setsKilld(Long skilld)
	{
		this.skilld = skilld;
	}
	public void setSKillName(String skillName)
	{
		this.skillName = skillName;
	}
	public Skill(Long skilld, String skillName) {
		super();
		this.skilld = skilld;
		this.skillName = skillName;
	}
	}
