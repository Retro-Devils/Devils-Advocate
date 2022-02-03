.class public Lcom/google/android/material/internal/g;
.super Landroidx/appcompat/view/menu/g;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/appcompat/view/menu/g;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/appcompat/view/menu/g;->a(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/view/menu/i;

    new-instance p2, Lcom/google/android/material/internal/i;

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/g;->w()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3, p0, p1}, Lcom/google/android/material/internal/i;-><init>(Landroid/content/Context;Lcom/google/android/material/internal/g;Landroidx/appcompat/view/menu/i;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/view/menu/i;->x(Landroidx/appcompat/view/menu/r;)V

    return-object p2
.end method
