.class Lb/p/d$a;
.super Lb/p/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/p/d;->j0(Landroid/view/View;FF)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lb/p/d;


# direct methods
.method constructor <init>(Lb/p/d;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lb/p/d$a;->b:Lb/p/d;

    iput-object p2, p0, Lb/p/d$a;->a:Landroid/view/View;

    invoke-direct {p0}, Lb/p/n;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lb/p/m;)V
    .locals 2

    iget-object v0, p0, Lb/p/d$a;->a:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lb/p/c0;->g(Landroid/view/View;F)V

    iget-object v0, p0, Lb/p/d$a;->a:Landroid/view/View;

    invoke-static {v0}, Lb/p/c0;->a(Landroid/view/View;)V

    invoke-virtual {p1, p0}, Lb/p/m;->P(Lb/p/m$f;)Lb/p/m;

    return-void
.end method
