package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.view.menu.C0134i;

/* renamed from: com.google.android.material.internal.g */
public class C3175g extends C0130g {
    public C3175g(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0130g, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0134i iVar = (C0134i) mo635a(i, i2, i3, charSequence);
        C3189i iVar2 = new C3189i(mo683w(), this, iVar);
        iVar.mo747x(iVar2);
        return iVar2;
    }
}
