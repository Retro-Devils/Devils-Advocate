.class public final Lc/b/a/c/a/f/n$e;
.super Lc/b/a/c/a/f/e$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/c/a/f/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lc/b/a/c/a/f/n;


# direct methods
.method protected constructor <init>(Lc/b/a/c/a/f/n;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/c/a/f/n$e;->a:Lc/b/a/c/a/f/n;

    invoke-direct {p0}, Lc/b/a/c/a/f/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final d0(Ljava/lang/String;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, Lc/b/a/c/a/f/n$e;->a:Lc/b/a/c/a/f/n;

    iget-object v1, v0, Lc/b/a/c/a/f/n;->b:Landroid/os/Handler;

    new-instance v2, Lc/b/a/c/a/f/n$d;

    invoke-direct {v2, v0, p1, p2}, Lc/b/a/c/a/f/n$d;-><init>(Lc/b/a/c/a/f/n;Ljava/lang/String;Landroid/os/IBinder;)V

    const/4 p1, 0x1

    invoke-virtual {v1, p1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
