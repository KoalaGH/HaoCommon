package cn.haoyunbang.common.widget.anim;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

/**
 * 淡出效果
 */
public class FadeExit extends BaseAnimatorSet {
	@Override
	public void setAnimation(View view) {
		duration = 200;
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "alpha", 1, 0).setDuration(duration));
	}
}
