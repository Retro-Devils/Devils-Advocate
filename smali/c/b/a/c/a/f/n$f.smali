.class final Lc/b/a/c/a/f/n$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/c/a/f/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Lc/b/a/c/a/f/n;


# direct methods
.method constructor <init>(Lc/b/a/c/a/f/n;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/c/a/f/n$f;->a:Lc/b/a/c/a/f/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    iget-object p1, p0, Lc/b/a/c/a/f/n$f;->a:Lc/b/a/c/a/f/n;

    invoke-virtual {p1, p2}, Lc/b/a/c/a/f/n;->n(Landroid/os/IBinder;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Lc/b/a/c/a/f/n$f;->a:Lc/b/a/c/a/f/n;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lc/b/a/c/a/f/n;->e(Lc/b/a/c/a/f/n;Landroid/os/IInterface;)Landroid/os/IInterface;

    iget-object p1, p0, Lc/b/a/c/a/f/n$f;->a:Lc/b/a/c/a/f/n;

    invoke-virtual {p1}, Lc/b/a/c/a/f/n;->v()V

    return-void
.end method
