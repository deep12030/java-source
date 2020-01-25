package javaApp;

public class Apps {

	int watt;
	String color;
	float price;
	String size;

	void InserValue(int w, String c, float p)
	{
	watt=w;
	color=c;
	price=p;
	System.out.println("data inserted with default size");
	}
	void InserValue(int w, String c, float p, String s)
	{
	watt=w;
	color=c;
	price=p;
	size=s;
	System.out.println("data inserted with default size");
	}
	void Showvalue()
	{
	System.out.println("watt:"+watt);
	System.out.println("color:"+color);
	System.out.println("price:"+price);
	System.out.println("size:"+size);
	}}
	