/***
	Copyright (c) 2008-2009 CommonsWare, LLC
	
	Licensed under the Apache License, Version 2.0 (the "License"); you may
	not use this file except in compliance with the License. You may obtain
	a copy of the License at
		http://www.apache.org/licenses/LICENSE-2.0
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/

package com.commonsware.android.fancylists.seven;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

class ViewWrapper {
	ViewGroup base;
	View guts=null;
	RatingBar rate=null;
	
	ViewWrapper(ViewGroup base) {
		this.base=base;
	}
	
	RatingBar getRatingBar() {
		if (rate==null) {
			rate=(RatingBar)base.getChildAt(0);
		}
		
		return(rate);
	}
	
	void setRatingBar(RatingBar rate) {
		this.rate=rate;
	}
	
	View getGuts() {
		if (guts==null) {
			guts=base.getChildAt(1);
		}
		
		return(guts);
	}
	
	void setGuts(View guts) {
		this.guts=guts;
	}
}
