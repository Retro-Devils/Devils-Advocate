.class Lb/g/h/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


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
        "Ljava/util/concurrent/Callable<",
        "Lb/g/h/b$g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lb/g/h/a;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lb/g/h/a;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lb/g/h/b$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lb/g/h/b$a;->b:Lb/g/h/a;

    iput p3, p0, Lb/g/h/b$a;->c:I

    iput-object p4, p0, Lb/g/h/b$a;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb/g/h/b$g;
    .locals 4

    iget-object v0, p0, Lb/g/h/b$a;->a:Landroid/content/Context;

    iget-object v1, p0, Lb/g/h/b$a;->b:Lb/g/h/a;

    iget v2, p0, Lb/g/h/b$a;->c:I

    invoke-static {v0, v1, v2}, Lb/g/h/b;->f(Landroid/content/Context;Lb/g/h/a;I)Lb/g/h/b$g;

    move-result-object v0

    iget-object v1, v0, Lb/g/h/b$g;->a:Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    sget-object v2, Lb/g/h/b;->a:Lb/d/g;

    iget-object v3, p0, Lb/g/h/b$a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Lb/d/g;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb/g/h/b$a;->a()Lb/g/h/b$g;

    move-result-object v0

    return-object v0
.end method
