.class Lcom/digdroid/alman/dig/q3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/q3$g;,
        Lcom/digdroid/alman/dig/q3$d;,
        Lcom/digdroid/alman/dig/q3$f;,
        Lcom/digdroid/alman/dig/q3$e;
    }
.end annotation


# static fields
.field static a:Lcom/digdroid/alman/dig/t3;

.field static b:Ljava/lang/String;

.field static c:Z


# direct methods
.method static a(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;)V
    .locals 11

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c00ff

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0902b1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/EditText;

    const-string v1, "author"

    const-string v3, ""

    invoke-virtual {p1, v1, v3}, Lcom/digdroid/alman/dig/n;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f09010a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/EditText;

    const-string v1, "author_contact"

    invoke-virtual {p1, v1, v3}, Lcom/digdroid/alman/dig/n;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f0900ff

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/EditText;

    const-string v1, "description"

    invoke-virtual {p1, v1, v3}, Lcom/digdroid/alman/dig/n;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f090354

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/TextView;

    const-string v1, "screenshots"

    invoke-virtual {p1, v1}, Lcom/digdroid/alman/dig/s3;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    new-instance v1, Lcom/digdroid/alman/dig/q3$a;

    invoke-direct {v1, p0, v8}, Lcom/digdroid/alman/dig/q3$a;-><init>(Landroid/app/Activity;Landroid/widget/TextView;)V

    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f090061

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/CheckBox;

    const/4 v1, 0x1

    const-string v3, "allow_playstore"

    invoke-virtual {p1, v3, v1}, Lcom/digdroid/alman/dig/n;->c(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v9, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    new-instance v1, Landroidx/appcompat/app/b$a;

    invoke-direct {v1, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    const v3, 0x7f110272

    invoke-virtual {v1, v3}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f11005a

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f1101da

    new-instance v2, Lcom/digdroid/alman/dig/q3$b;

    move-object v3, v2

    move-object v4, p1

    move-object v10, p0

    invoke-direct/range {v3 .. v10}, Lcom/digdroid/alman/dig/q3$b;-><init>(Lcom/digdroid/alman/dig/s3;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/CheckBox;Landroid/app/Activity;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method static b()I
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/t3;->d()I

    move-result v0

    return v0
.end method

.method static c()I
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/t3;->e()I

    move-result v0

    return v0
.end method

.method static d(F)F
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t3;->a:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {v0, p0}, Lcom/digdroid/alman/dig/s3;->x(F)F

    move-result p0

    return p0
.end method

.method static e(F)F
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t3;->a:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {v0, p0}, Lcom/digdroid/alman/dig/s3;->y(F)F

    move-result p0

    return p0
.end method

.method public static f(Lcom/digdroid/alman/dig/c4;)V
    .locals 5

    invoke-static {p0}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v1

    sput-boolean v1, Lcom/digdroid/alman/dig/q3;->c:Z

    new-instance v1, Lcom/digdroid/alman/dig/s3;

    const-string v2, "black.cfg"

    invoke-direct {v1, p0, v2}, Lcom/digdroid/alman/dig/s3;-><init>(Lcom/digdroid/alman/dig/c4;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/s3;->z()Z

    move-result v3

    const-string v4, "name"

    if-nez v3, :cond_0

    const-string v3, "themes/black.cfg"

    invoke-virtual {v1, v3}, Lcom/digdroid/alman/dig/s3;->j(Ljava/lang/String;)V

    const v3, 0x7f110050

    invoke-virtual {p0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/s3;->R()V

    :cond_0
    new-instance v1, Lcom/digdroid/alman/dig/s3;

    const-string v3, "white.cfg"

    invoke-direct {v1, p0, v3}, Lcom/digdroid/alman/dig/s3;-><init>(Lcom/digdroid/alman/dig/c4;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/s3;->z()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "themes/white.cfg"

    invoke-virtual {v1, v3}, Lcom/digdroid/alman/dig/s3;->j(Ljava/lang/String;)V

    const v3, 0x7f110297

    invoke-virtual {p0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/s3;->R()V

    :cond_1
    new-instance v1, Lcom/digdroid/alman/dig/s3;

    const-string v3, "grey.cfg"

    invoke-direct {v1, p0, v3}, Lcom/digdroid/alman/dig/s3;-><init>(Lcom/digdroid/alman/dig/c4;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/s3;->z()Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "themes/grey.cfg"

    invoke-virtual {v1, v3}, Lcom/digdroid/alman/dig/s3;->j(Ljava/lang/String;)V

    const v3, 0x7f11010f

    invoke-virtual {p0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/s3;->R()V

    :cond_2
    new-instance v1, Lcom/digdroid/alman/dig/s3;

    const-string v3, "darkblue.cfg"

    invoke-direct {v1, p0, v3}, Lcom/digdroid/alman/dig/s3;-><init>(Lcom/digdroid/alman/dig/c4;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/s3;->z()Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "themes/darkblue.cfg"

    invoke-virtual {v1, v3}, Lcom/digdroid/alman/dig/s3;->j(Ljava/lang/String;)V

    const v3, 0x7f110051

    invoke-virtual {p0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/s3;->R()V

    :cond_3
    const-string v1, "theme_file"

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/digdroid/alman/dig/q3;->b:Ljava/lang/String;

    new-instance v1, Lcom/digdroid/alman/dig/t3;

    invoke-direct {v1, p0, v0}, Lcom/digdroid/alman/dig/t3;-><init>(Lcom/digdroid/alman/dig/c4;Ljava/lang/String;)V

    sput-object v1, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    return-void
.end method

.method public static g(I)Landroid/graphics/drawable/StateListDrawable;
    .locals 5

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-static {p0}, Lcom/digdroid/alman/dig/q3;->h(I)I

    move-result p0

    invoke-direct {v0, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    new-instance p0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {p0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const/4 v1, 0x1

    new-array v2, v1, [I

    const v3, 0x10100a7

    const/4 v4, 0x0

    aput v3, v2, v4

    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array v2, v1, [I

    const v3, 0x1010367

    aput v3, v2, v4

    invoke-virtual {p0, v2, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array v1, v1, [I

    const v2, 0x101009c

    aput v2, v1, v4

    invoke-virtual {p0, v1, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public static h(I)I
    .locals 1

    const/16 v0, 0x40

    invoke-static {p0, v0}, Lcom/digdroid/alman/dig/q3;->i(II)I

    move-result p0

    return p0
.end method

.method public static i(II)I
    .locals 3

    shr-int/lit8 v0, p0, 0x10

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x80

    if-lt v0, v1, :cond_0

    sub-int/2addr v0, p1

    goto :goto_0

    :cond_0
    add-int/2addr v0, p1

    :goto_0
    shr-int/lit8 v2, p0, 0x8

    and-int/lit16 v2, v2, 0xff

    if-lt v2, v1, :cond_1

    sub-int/2addr v2, p1

    goto :goto_1

    :cond_1
    add-int/2addr v2, p1

    :goto_1
    and-int/lit16 p0, p0, 0xff

    if-lt p0, v1, :cond_2

    sub-int/2addr p0, p1

    goto :goto_2

    :cond_2
    add-int/2addr p0, p1

    :goto_2
    const/high16 p1, -0x80000000

    shl-int/lit8 v0, v0, 0x10

    or-int/2addr p1, v0

    shl-int/lit8 v0, v2, 0x8

    or-int/2addr p1, v0

    or-int/2addr p0, p1

    return p0
.end method

.method static j(Lcom/digdroid/alman/dig/c4;Lcom/digdroid/alman/dig/q3$e;)V
    .locals 2

    new-instance v0, Lcom/digdroid/alman/dig/q3$f;

    invoke-direct {v0, p1}, Lcom/digdroid/alman/dig/q3$f;-><init>(Lcom/digdroid/alman/dig/q3$e;)V

    const/4 p1, 0x1

    new-array p1, p1, [Lcom/digdroid/alman/dig/c4;

    const/4 v1, 0x0

    aput-object p0, p1, v1

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method static k(Lcom/digdroid/alman/dig/t3;)F
    .locals 1

    iget p0, p0, Lcom/digdroid/alman/dig/t3;->c:I

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    int-to-float p0, p0

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p0, v0

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p0

    return v0
.end method

.method static l(Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 2

    new-instance v0, Lcom/digdroid/alman/dig/i;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/i;->g(Z)V

    new-instance v1, Lcom/digdroid/alman/dig/q3$c;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/q3$c;-><init>(Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/i;->h(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/i;->d()V

    return-void
.end method

.method static m()I
    .locals 1

    const v0, -0x99999a

    return v0
.end method

.method static n(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 3

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "PROGRESS_UPDATE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "label"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "progress"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-static {p0}, Lb/o/a/a;->b(Landroid/content/Context;)Lb/o/a/a;

    move-result-object p0

    invoke-virtual {p0, v0}, Lb/o/a/a;->d(Landroid/content/Intent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static o(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-static {p0}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p0

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/digdroid/alman/dig/t3;->a:Lcom/digdroid/alman/dig/s3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/s3;->R()V

    const/4 v0, 0x1

    const-string v1, "new_theme_set"

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    :cond_0
    sput-object p1, Lcom/digdroid/alman/dig/q3;->b:Ljava/lang/String;

    const-string v0, "theme_file"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/c3;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static p(Lcom/digdroid/alman/dig/t3;)V
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t3;->a:Lcom/digdroid/alman/dig/s3;

    iput-object v0, p0, Lcom/digdroid/alman/dig/t3;->a:Lcom/digdroid/alman/dig/s3;

    sput-object p0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    return-void
.end method

.method public static q(Landroid/view/View;)V
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    iget v0, v0, Lcom/digdroid/alman/dig/t3;->c:I

    invoke-static {p0, v0}, Lcom/digdroid/alman/dig/q3;->r(Landroid/view/View;I)V

    return-void
.end method

.method public static r(Landroid/view/View;I)V
    .locals 2

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->g(I)Landroid/graphics/drawable/StateListDrawable;

    move-result-object p1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method public static s(Landroid/widget/TextView;)V
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/t3;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/t3;->b()I

    move-result v0

    invoke-static {p0, v0}, Lcom/digdroid/alman/dig/q3;->r(Landroid/view/View;I)V

    return-void
.end method

.method public static t(Landroid/content/Context;Lcom/google/android/material/navigation/NavigationView;)V
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v0, 0x7f050108

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->g(I)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    const v0, 0x7f050112

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationView;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    const v0, 0x7f050110

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/material/navigation/NavigationView;->setItemIconTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method static u(F)F
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t3;->a:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {v0, p0}, Lcom/digdroid/alman/dig/s3;->b0(F)F

    move-result p0

    return p0
.end method

.method static v()I
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/t3;->a()I

    move-result v0

    return v0
.end method

.method static w()I
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    iget v0, v0, Lcom/digdroid/alman/dig/t3;->b:I

    return v0
.end method
