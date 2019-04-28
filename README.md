# SciFi UI Project

Name: David King

Student Number: C17349641

Fork this repository and use it a starter project for your assignment

# Description of the assignment
For my assignment I choose to do base it around a star wars based UI system seen in some of the older films.
It has based on the UI for a Tiefighter and portrays flashes warning indicators and target system a TieFighter would have.
Theres lots of flashing interface information around the screen and contains animated feedback about the TieFighter and its current state. 

# Instructions
The bottom right is a visualiztion of the TieFighter for the pilot. It shows its current state and where damages and system failures are located. The top right is the target system showing the TieFighter targeting along the Death star channel as seen in the original movies. The top left is the radar and a graph indicating more spefic information about the ship and in the bottom left the ships screen and UI system for the pilot to control the ship.

# How it works
My assignment was laid out similarly to the starter project for the assignment. UI. java is called from Main.java. From UI.java objects are created for the relevant classes used to create and display the interface. I tehn call the various methods using these objects to launch the code to the screen created in UI.java. The render methods draws and creates the Interafce for each class and the update methods adds whatever animation is used with that piece of interface. The code to draw the interface uses common variables with while and for loops to draw the interface in proportion to the screen size. processing.core.PApplet
and java.util.Random are used to help draw and animate the interface.

# What I am most proud of in the assignment
On the MovingCircles class I created a scrolling information bar with interface information that slowly makes its way scross the middle of the screen.A for loop is used to print a rectangle and text thats stored in an array. The boxes are animated to move across the screen from left to right. The position of the x co-ordinate of the rectangle and the text is updated using an update method. It moves all the way across the screen recognising its edge until the moves completely off the scree. It then loops and the process starts again starting from the left side of the screen.

I also created an animated bar graph to display interface information. In the InFoGraph class I updated variables using if statements and loops to animate the bars on the bar chart. Their width scrolls between two variables and the rate at which they increase and decrease at varies between each bar. I though this was a cool addition as it seems like the interafce is reacting to a situation and giving off information based on whats happening to the ship.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

