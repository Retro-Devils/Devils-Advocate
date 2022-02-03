.class public Lcom/digdroid/alman/dig/w2;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/w2$k;,
        Lcom/digdroid/alman/dig/w2$i;,
        Lcom/digdroid/alman/dig/w2$j;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field b:Landroid/database/sqlite/SQLiteDatabase;

.field c:Z

.field d:Lcom/digdroid/alman/dig/c3;

.field private e:J

.field private f:J

.field g:F

.field private h:Lcom/digdroid/alman/dig/w2$j;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/database/sqlite/SQLiteDatabase;ZLcom/digdroid/alman/dig/w2$j;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/digdroid/alman/dig/w2;->f:J

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/digdroid/alman/dig/w2;->g:F

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/w2;->a:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/digdroid/alman/dig/w2;->b:Landroid/database/sqlite/SQLiteDatabase;

    iput-object p4, p0, Lcom/digdroid/alman/dig/w2;->h:Lcom/digdroid/alman/dig/w2$j;

    iput-boolean p3, p0, Lcom/digdroid/alman/dig/w2;->c:Z

    invoke-static {p1}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/w2;->d:Lcom/digdroid/alman/dig/c3;

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/w2;)J
    .locals 2

    iget-wide v0, p0, Lcom/digdroid/alman/dig/w2;->e:J

    return-wide v0
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/w2;)Lcom/digdroid/alman/dig/w2$j;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/w2;->h:Lcom/digdroid/alman/dig/w2$j;

    return-object p0
.end method

.method static synthetic c(Lcom/digdroid/alman/dig/w2;)J
    .locals 2

    iget-wide v0, p0, Lcom/digdroid/alman/dig/w2;->f:J

    return-wide v0
.end method

.method static synthetic d(Lcom/digdroid/alman/dig/w2;J)J
    .locals 0

    iput-wide p1, p0, Lcom/digdroid/alman/dig/w2;->f:J

    return-wide p1
.end method

.method static synthetic e(Lcom/digdroid/alman/dig/w2;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/w2;->a:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method private h(Landroid/graphics/drawable/Drawable;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2}, Landroidx/core/graphics/drawable/a;->n(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public f(J)V
    .locals 1

    iput-wide p1, p0, Lcom/digdroid/alman/dig/w2;->e:J

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/w2;->c:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/w2;->d:Lcom/digdroid/alman/dig/c3;

    const-string v0, "dont_ask_to_rate"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/w2;->h:Lcom/digdroid/alman/dig/w2$j;

    invoke-interface {p1, p2}, Lcom/digdroid/alman/dig/w2$j;->a(Z)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/digdroid/alman/dig/w2$i;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/w2$i;-><init>(Lcom/digdroid/alman/dig/w2;)V

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {p1, v0, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method g()V
    .locals 10

    iget-object v0, p0, Lcom/digdroid/alman/dig/w2;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c00e5

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090079

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iget-boolean v3, p0, Lcom/digdroid/alman/dig/w2;->c:Z

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    const/16 v3, 0x8

    :goto_0
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v2, Lcom/digdroid/alman/dig/w2$b;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/w2$b;-><init>(Lcom/digdroid/alman/dig/w2;)V

    iget v3, p0, Lcom/digdroid/alman/dig/w2;->g:F

    iput v3, v2, Lcom/digdroid/alman/dig/w2$b;->a:F

    iget-object v3, p0, Lcom/digdroid/alman/dig/w2;->d:Lcom/digdroid/alman/dig/c3;

    const-string v6, "share_ratings"

    const/4 v7, 0x1

    invoke-virtual {v3, v6, v7}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v2, Lcom/digdroid/alman/dig/w2$b;->b:Z

    iget-object v3, p0, Lcom/digdroid/alman/dig/w2;->d:Lcom/digdroid/alman/dig/c3;

    const-string v6, "share_stats"

    invoke-virtual {v3, v6, v7}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v2, Lcom/digdroid/alman/dig/w2$b;->c:Z

    iget-object v3, p0, Lcom/digdroid/alman/dig/w2;->d:Lcom/digdroid/alman/dig/c3;

    const-string v6, "dont_ask_to_rate"

    invoke-virtual {v3, v6, v5}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v2, Lcom/digdroid/alman/dig/w2$b;->d:Z

    const v3, 0x7f090328

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/RatingBar;

    sget-object v6, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {v6}, Lcom/digdroid/alman/dig/t3;->b()I

    move-result v6

    invoke-static {v3, v6}, Lcom/digdroid/alman/dig/q3;->r(Landroid/view/View;I)V

    invoke-virtual {v3}, Landroid/widget/RatingBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    check-cast v6, Landroid/graphics/drawable/LayerDrawable;

    const/4 v8, 0x2

    invoke-virtual {v6, v8}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    const/16 v9, -0x2100

    invoke-direct {p0, v8, v9}, Lcom/digdroid/alman/dig/w2;->h(Landroid/graphics/drawable/Drawable;I)V

    invoke-virtual {v6, v7}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    const v9, 0x40888888

    invoke-direct {p0, v8, v9}, Lcom/digdroid/alman/dig/w2;->h(Landroid/graphics/drawable/Drawable;I)V

    invoke-virtual {v6, v5}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-direct {p0, v6, v9}, Lcom/digdroid/alman/dig/w2;->h(Landroid/graphics/drawable/Drawable;I)V

    iget v6, p0, Lcom/digdroid/alman/dig/w2;->g:F

    const/4 v8, 0x0

    invoke-static {v8, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    invoke-virtual {v3, v6}, Landroid/widget/RatingBar;->setRating(F)V

    new-instance v6, Lcom/digdroid/alman/dig/w2$a;

    invoke-direct {v6, p0, v2}, Lcom/digdroid/alman/dig/w2$a;-><init>(Lcom/digdroid/alman/dig/w2;Lcom/digdroid/alman/dig/w2$b;)V

    invoke-virtual {v3, v6}, Landroid/widget/RatingBar;->setOnRatingBarChangeListener(Landroid/widget/RatingBar$OnRatingBarChangeListener;)V

    const v6, 0x7f0902d4

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/CheckBox;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->b()I

    move-result v9

    invoke-virtual {v6, v9}, Landroid/widget/CheckBox;->setTextColor(I)V

    sget-object v9, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {v9}, Lcom/digdroid/alman/dig/t3;->b()I

    move-result v9

    invoke-static {v6, v9}, Lcom/digdroid/alman/dig/q3;->r(Landroid/view/View;I)V

    iget v9, p0, Lcom/digdroid/alman/dig/w2;->g:F

    cmpg-float v9, v9, v8

    if-gez v9, :cond_2

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    invoke-virtual {v6, v7}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget v7, p0, Lcom/digdroid/alman/dig/w2;->g:F

    cmpg-float v7, v7, v8

    if-gez v7, :cond_3

    const/16 v7, 0x8

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    :goto_2
    invoke-virtual {v3, v7}, Landroid/widget/RatingBar;->setVisibility(I)V

    new-instance v7, Lcom/digdroid/alman/dig/w2$c;

    invoke-direct {v7, p0, v2, v3}, Lcom/digdroid/alman/dig/w2$c;-><init>(Lcom/digdroid/alman/dig/w2;Lcom/digdroid/alman/dig/w2$b;Landroid/widget/RatingBar;)V

    invoke-virtual {v6, v7}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v3, 0x7f09037e

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    invoke-static {v3}, Lcom/digdroid/alman/dig/q3;->s(Landroid/widget/TextView;)V

    iget-boolean v6, v2, Lcom/digdroid/alman/dig/w2$b;->b:Z

    invoke-virtual {v3, v6}, Landroid/widget/CheckBox;->setChecked(Z)V

    new-instance v6, Lcom/digdroid/alman/dig/w2$d;

    invoke-direct {v6, p0, v2}, Lcom/digdroid/alman/dig/w2$d;-><init>(Lcom/digdroid/alman/dig/w2;Lcom/digdroid/alman/dig/w2$b;)V

    invoke-virtual {v3, v6}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v3, 0x7f09037f

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    invoke-static {v3}, Lcom/digdroid/alman/dig/q3;->s(Landroid/widget/TextView;)V

    iget-boolean v6, v2, Lcom/digdroid/alman/dig/w2$b;->c:Z

    invoke-virtual {v3, v6}, Landroid/widget/CheckBox;->setChecked(Z)V

    new-instance v6, Lcom/digdroid/alman/dig/w2$e;

    invoke-direct {v6, p0, v2}, Lcom/digdroid/alman/dig/w2$e;-><init>(Lcom/digdroid/alman/dig/w2;Lcom/digdroid/alman/dig/w2$b;)V

    invoke-virtual {v3, v6}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v3, 0x7f09016a

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    invoke-static {v3}, Lcom/digdroid/alman/dig/q3;->s(Landroid/widget/TextView;)V

    iget-boolean v6, v2, Lcom/digdroid/alman/dig/w2$b;->d:Z

    invoke-virtual {v3, v6}, Landroid/widget/CheckBox;->setChecked(Z)V

    new-instance v6, Lcom/digdroid/alman/dig/w2$f;

    invoke-direct {v6, p0, v2}, Lcom/digdroid/alman/dig/w2$f;-><init>(Lcom/digdroid/alman/dig/w2;Lcom/digdroid/alman/dig/w2$b;)V

    invoke-virtual {v3, v6}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-boolean v6, p0, Lcom/digdroid/alman/dig/w2;->c:Z

    if-eqz v6, :cond_4

    const/4 v4, 0x0

    :cond_4
    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setVisibility(I)V

    new-instance v3, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v4

    invoke-direct {v3, v0, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v3, v1}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const v3, 0x7f1101da

    new-instance v4, Lcom/digdroid/alman/dig/w2$h;

    invoke-direct {v4, p0, v2, v0}, Lcom/digdroid/alman/dig/w2$h;-><init>(Lcom/digdroid/alman/dig/w2;Lcom/digdroid/alman/dig/w2$b;Landroid/app/Activity;)V

    invoke-virtual {v1, v3, v4}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f11005a

    new-instance v2, Lcom/digdroid/alman/dig/w2$g;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/w2$g;-><init>(Lcom/digdroid/alman/dig/w2;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/w2;->c:Z

    if-nez v1, :cond_5

    const v1, 0x7f110205

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    :cond_5
    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_6
    :goto_3
    return-void
.end method
