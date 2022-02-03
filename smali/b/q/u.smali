.class Lb/q/u;
.super Lb/q/z;
.source ""

# interfaces
.implements Lb/q/w;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lb/q/z;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method

.method static g(Landroid/view/ViewGroup;)Lb/q/u;
    .locals 0

    invoke-static {p0}, Lb/q/z;->e(Landroid/view/View;)Lb/q/z;

    move-result-object p0

    check-cast p0, Lb/q/u;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lb/q/z;->a:Lb/q/z$a;

    invoke-virtual {v0, p1}, Lb/q/z$a;->b(Landroid/view/View;)V

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lb/q/z;->a:Lb/q/z$a;

    invoke-virtual {v0, p1}, Lb/q/z$a;->g(Landroid/view/View;)V

    return-void
.end method
