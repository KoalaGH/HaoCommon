package cn.haoyunbang.common.widget.anim;

import android.view.View;

import com.nineoldandroids.animation.ObjectAnimator;

/**
 * 淡入效果
 */
public class FadeEnter extends BaseAnimatorSet {
	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "alpha", 0, 1).setDuration(duration));
	}
}
