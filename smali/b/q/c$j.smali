.class Lb/q/c$j;
.super Lb/q/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/q/c;->n(Landroid/view/ViewGroup;Lb/q/s;Lb/q/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Lb/q/c;


# direct methods
.method constructor <init>(Lb/q/c;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lb/q/c$j;->c:Lb/q/c;

    iput-object p2, p0, Lb/q/c$j;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lb/q/n;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lb/q/c$j;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lb/q/m;)V
    .locals 1

    iget-object p1, p0, Lb/q/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lb/q/x;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public b(Lb/q/m;)V
    .locals 1

    iget-object p1, p0, Lb/q/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lb/q/x;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public d(Lb/q/m;)V
    .locals 1

    iget-object p1, p0, Lb/q/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lb/q/x;->c(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb/q/c$j;->a:Z

    return-void
.end method

.method public e(Lb/q/m;)V
    .locals 2

    iget-boolean v0, p0, Lb/q/c$j;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lb/q/c$j;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lb/q/x;->c(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, Lb/q/m;->P(Lb/q/m$f;)Lb/q/m;

    return-void
.end method
