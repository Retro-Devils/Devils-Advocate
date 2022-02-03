.class public final Lc/c/a/a/b/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/c/a/a/c/a$l;


# instance fields
.field private a:Lc/c/a/a/c/a$l;


# direct methods
.method public constructor <init>(Lc/c/a/a/c/a$l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/c/a/a/b/c;->a:Lc/c/a/a/c/a$l;

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Lc/c/a/a/b/c;->a:Lc/c/a/a/c/a$l;

    invoke-interface {v0, p1}, Lc/c/a/a/c/a$l;->a(F)V

    return-void
.end method

.method public final b(Landroid/view/View;F)V
    .locals 1

    iget-object v0, p0, Lc/c/a/a/b/c;->a:Lc/c/a/a/c/a$l;

    invoke-interface {v0, p1, p2}, Lc/c/a/a/c/a$l;->b(Landroid/view/View;F)V

    return-void
.end method

.method public final c(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)V
    .locals 1

    iget-object v0, p0, Lc/c/a/a/b/c;->a:Lc/c/a/a/c/a$l;

    invoke-interface {v0, p1}, Lc/c/a/a/c/a$l;->c(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)V

    return-void
.end method
