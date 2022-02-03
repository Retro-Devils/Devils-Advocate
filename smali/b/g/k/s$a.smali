.class Lb/g/k/s$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/g/k/s;->u0(Landroid/view/View;Lb/g/k/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/g/k/p;


# direct methods
.method constructor <init>(Lb/g/k/p;)V
    .locals 0

    iput-object p1, p0, Lb/g/k/s$a;->a:Lb/g/k/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    invoke-static {p2}, Lb/g/k/a0;->p(Landroid/view/WindowInsets;)Lb/g/k/a0;

    move-result-object p2

    iget-object v0, p0, Lb/g/k/s$a;->a:Lb/g/k/p;

    invoke-interface {v0, p1, p2}, Lb/g/k/p;->a(Landroid/view/View;Lb/g/k/a0;)Lb/g/k/a0;

    move-result-object p1

    invoke-virtual {p1}, Lb/g/k/a0;->o()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
