package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import p006b.p030g.p031d.C0901a;

/* access modifiers changed from: package-private */
/* renamed from: com.jaredrummler.android.colorpicker.b */
public class C3311b extends BaseAdapter {

    /* renamed from: b */
    final AbstractC3312a f11116b;

    /* renamed from: c */
    final int[] f11117c;

    /* renamed from: d */
    int f11118d;

    /* renamed from: e */
    int f11119e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.jaredrummler.android.colorpicker.b$a */
    public interface AbstractC3312a {
        /* renamed from: a */
        void mo11248a(int i);
    }

    /* renamed from: com.jaredrummler.android.colorpicker.b$b */
    private final class C3313b {

        /* renamed from: a */
        View f11120a;

        /* renamed from: b */
        ColorPanelView f11121b;

        /* renamed from: c */
        ImageView f11122c;

        /* renamed from: d */
        int f11123d;

        /* access modifiers changed from: package-private */
        /* renamed from: com.jaredrummler.android.colorpicker.b$b$a */
        public class View$OnClickListenerC3314a implements View.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ int f11125b;

            View$OnClickListenerC3314a(int i) {
                this.f11125b = i;
            }

            public void onClick(View view) {
                C3311b bVar = C3311b.this;
                int i = bVar.f11118d;
                int i2 = this.f11125b;
                if (i != i2) {
                    bVar.f11118d = i2;
                    bVar.notifyDataSetChanged();
                }
                C3311b bVar2 = C3311b.this;
                bVar2.f11116b.mo11248a(bVar2.f11117c[this.f11125b]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.jaredrummler.android.colorpicker.b$b$b */
        public class View$OnLongClickListenerC3315b implements View.OnLongClickListener {
            View$OnLongClickListenerC3315b() {
            }

            public boolean onLongClick(View view) {
                C3313b.this.f11121b.mo11201d();
                return true;
            }
        }

        C3313b(Context context) {
            View inflate = View.inflate(context, C3311b.this.f11119e == 0 ? C3332i.cpv_color_item_square : C3332i.cpv_color_item_circle, null);
            this.f11120a = inflate;
            this.f11121b = (ColorPanelView) inflate.findViewById(C3331h.cpv_color_panel_view);
            this.f11122c = (ImageView) this.f11120a.findViewById(C3331h.cpv_color_image_view);
            this.f11123d = this.f11121b.getBorderColor();
            this.f11120a.setTag(this);
        }

        /* renamed from: a */
        private void m13891a(int i) {
            C3311b bVar = C3311b.this;
            if (i != bVar.f11118d || C0901a.m5294b(bVar.f11117c[i]) < 0.65d) {
                this.f11122c.setColorFilter((ColorFilter) null);
            } else {
                this.f11122c.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
            }
        }

        /* renamed from: b */
        private void m13892b(int i) {
            this.f11121b.setOnClickListener(new View$OnClickListenerC3314a(i));
            this.f11121b.setOnLongClickListener(new View$OnLongClickListenerC3315b());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo11249c(int i) {
            int i2 = C3311b.this.f11117c[i];
            int alpha = Color.alpha(i2);
            this.f11121b.setColor(i2);
            this.f11122c.setImageResource(C3311b.this.f11118d == i ? C3330g.cpv_preset_checked : 0);
            if (alpha == 255) {
                m13891a(i);
            } else if (alpha <= 165) {
                this.f11121b.setBorderColor(i2 | -16777216);
                this.f11122c.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
            } else {
                this.f11121b.setBorderColor(this.f11123d);
                this.f11122c.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            m13892b(i);
        }
    }

    C3311b(AbstractC3312a aVar, int[] iArr, int i, int i2) {
        this.f11116b = aVar;
        this.f11117c = iArr;
        this.f11118d = i;
        this.f11119e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11243a() {
        this.f11118d = -1;
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f11117c.length;
    }

    public Object getItem(int i) {
        return Integer.valueOf(this.f11117c[i]);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C3313b bVar;
        if (view == null) {
            bVar = new C3313b(viewGroup.getContext());
            view2 = bVar.f11120a;
        } else {
            view2 = view;
            bVar = (C3313b) view.getTag();
        }
        bVar.mo11249c(i);
        return view2;
    }
}
