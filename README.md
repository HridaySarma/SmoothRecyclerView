# SmoothRecyclerView
A smooth and simple horizontal recycler view with a little bit of animations.

Here are two screenshots how it looks in use. You can use it however you like it .

![Screenshot_20200519-204944](https://user-images.githubusercontent.com/49075494/82346109-b03c0100-9a13-11ea-8024-fa6cc5fb2a56.png)

![Screenshot_20200519-204949~2](https://user-images.githubusercontent.com/49075494/82346163-bfbb4a00-9a13-11ea-8584-901c3ea4ff23.png)
`
## Implementation 

Add it in your root build.gradle at the end of repositories:

```bash
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```

### by Gradle

```bash
 implementation 'com.github.HridaySarma:SmoothRecyclerView:1.0.0'
```

## Usage

## In your activity.xml file add the Smooth Recycler View :

```bash
 <com.main.smoothrecyclerview.SmoothRecyclerView
        android:id="@+id/rview"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

```

## In your Activity.java file initialise the view and setup the adapter :

```bash
 private SmoothRecyclerView smoothRecyclerView;
 
  smoothRecyclerView = findViewById(R.id.rview);
  
  smoothRecyclerView.setAdapter(new Adapter(this,this));
        smoothRecyclerView.setOnItemSelectedListener(new SmoothRecyclerLayoutManager.OnSelected() {
            @Override
            public void onItemSelected(int position) {
     
            }
        });
        
        // Setting up adapter is the same as in a normal recycler view. 
        // The adapter code can be found in the sample app.
```








