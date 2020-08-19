# ViewPager2 - Swipe

## Fake Drag
A fake drag can be useful if you want to synchronize the motion of the ViewPager2 with the touch scrolling of another view, while still letting the ViewPager2 control the snapping motion and fling behavior.

```
btn_fake_swipe.setOnClickListener {
    my_view_pager.apply {
        beginFakeDrag()
        fakeDragBy(-200f)
        endFakeDrag()
    }
}
```

## App Demo
<img src="https://i.gyazo.com/8255dc026857fb9fb8472fb076064456.gif" width="350px" height="650px" />
