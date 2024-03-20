package com.anonymous;


	public class Device {

		Switchable obj=new Switchable() {
			
			@Override
			public void on() {
				// TODO Auto-generated method stub
				System.out.println("I am in On()");
			}
			
			@Override
			public void off() {
				// TODO Auto-generated method stub
				System.out.println("I am in Off");
				
			}
		};
		public void play(Switchable obj)
		{
			obj.on();
			obj.off();
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Device d=new Device();
			d.obj.on();
			d.obj.off();
			d.play(new Switchable() {
				
				@Override
				public void on() {
					// TODO Auto-generated method stub
					System.out.println(" I am in On of play()");
				}
				
				@Override
				public void off() {
					// TODO Auto-generated method stub
					System.out.println(" i am i Off of play()");
				}
			});
		
		}

	}

	
