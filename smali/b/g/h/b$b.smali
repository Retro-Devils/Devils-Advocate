.class Lb/g/h/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/g/h/c$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/g/h/b;->g(Landroid/content/Context;Lb/g/h/a;Landroidx/core/content/c/f$a;Landroid/os/Handler;ZII)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb/g/h/c$d<",
        "Lb/g/h/b$g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/core/content/c/f$a;

.field final synthetic b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Landroidx/core/content/c/f$a;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lb/g/h/b$b;->a:Landroidx/core/content/c/f$a;

    iput-object p2, p0, Lb/g/h/b$b;->b:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb/g/h/b$g;

    invoke-virtual {p0, p1}, Lb/g/h/b$b;->b(Lb/g/h/b$g;)V

    return-void
.end method

.method public b(Lb/g/h/b$g;)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lb/g/h/b$b;->a:Landroidx/core/content/c/f$a;

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lb/g/h/b$b;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0, v1}, Landroidx/core/content/c/f$a;->a(ILandroid/os/Handler;)V

    goto :goto_1

    :cond_0
    iget v0, p1, Lb/g/h/b$g;->b:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lb/g/h/b$b;->a:Landroidx/core/content/c/f$a;

    iget-object p1, p1, Lb/g/h/b$g;->a:Landroid/graphics/Typeface;

    iget-object v1, p0, Lb/g/h/b$b;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1, v1}, Landroidx/core/content/c/f$a;->b(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lb/g/h/b$b;->a:Landroidx/core/content/c/f$a;

    goto :goto_0

    :goto_1
    return-void
.end method
