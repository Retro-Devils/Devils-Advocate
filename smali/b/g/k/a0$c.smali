.class Lb/g/k/a0$c;
.super Lb/g/k/a0$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/g/k/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field final b:Landroid/view/WindowInsets$Builder;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb/g/k/a0$d;-><init>()V

    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Lb/g/k/a0$c;->b:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method constructor <init>(Lb/g/k/a0;)V
    .locals 1

    invoke-direct {p0}, Lb/g/k/a0$d;-><init>()V

    invoke-virtual {p1}, Lb/g/k/a0;->o()Landroid/view/WindowInsets;

    move-result-object p1

    new-instance v0, Landroid/view/WindowInsets$Builder;

    if-eqz p1, :cond_0

    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    :goto_0
    iput-object v0, p0, Lb/g/k/a0$c;->b:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method a()Lb/g/k/a0;
    .locals 1

    iget-object v0, p0, Lb/g/k/a0$c;->b:Landroid/view/WindowInsets$Builder;

    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lb/g/k/a0;->p(Landroid/view/WindowInsets;)Lb/g/k/a0;

    move-result-object v0

    return-object v0
.end method

.method b(Lb/g/d/b;)V
    .locals 1

    iget-object v0, p0, Lb/g/k/a0$c;->b:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb/g/d/b;->c()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method c(Lb/g/d/b;)V
    .locals 1

    iget-object v0, p0, Lb/g/k/a0$c;->b:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb/g/d/b;->c()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
