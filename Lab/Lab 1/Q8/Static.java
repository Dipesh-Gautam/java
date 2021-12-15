class Static
{
	static int counter;
	static int count;
	public void increment()
	{
		counter++;
	}
	public static int getCounter()
	{
		count++;
		return counter;
	}
    public static void main(String[] args)
	{
		Static count1 = new Static();
		Static count2 = new Static();
		count1.increment();
		System.out.println(Static.getCounter());// when the method and variables are static , classname can be used  directly. i.e no need to make object
		count2.increment();
		System.out.println(Static.getCounter());
	}
}