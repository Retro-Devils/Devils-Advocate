.class public final Lc/b/a/c/a/f/n$d;
.super Lc/b/a/c/a/f/n$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/c/a/f/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/b/a/c/a/f/n$c<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:Lc/b/a/c/a/b;

.field public final d:Landroid/os/IBinder;

.field final synthetic e:Lc/b/a/c/a/f/n;


# direct methods
.method public constructor <init>(Lc/b/a/c/a/f/n;Ljava/lang/String;Landroid/os/IBinder;)V
    .locals 1

    iput-object p1, p0, Lc/b/a/c/a/f/n$d;->e:Lc/b/a/c/a/f/n;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p0, p1, v0}, Lc/b/a/c/a/f/n$c;-><init>(Lc/b/a/c/a/f/n;Ljava/lang/Object;)V

    invoke-static {p2}, Lc/b/a/c/a/f/n;->f(Ljava/lang/String;)Lc/b/a/c/a/b;

    move-result-object p1

    iput-object p1, p0, Lc/b/a/c/a/f/n$d;->c:Lc/b/a/c/a/b;

    iput-object p3, p0, Lc/b/a/c/a/f/n$d;->d:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method protected final synthetic b(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_2

    sget-object p1, Lc/b/a/c/a/f/n$a;->a:[I

    iget-object v0, p0, Lc/b/a/c/a/f/n$d;->c:Lc/b/a/c/a/b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lc/b/a/c/a/f/n$d;->e:Lc/b/a/c/a/f/n;

    iget-object v0, p0, Lc/b/a/c/a/f/n$d;->c:Lc/b/a/c/a/b;

    invoke-virtual {p1, v0}, Lc/b/a/c/a/f/n;->i(Lc/b/a/c/a/b;)V

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object p1, p0, Lc/b/a/c/a/f/n$d;->d:Landroid/os/IBinder;

    invoke-interface {p1}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lc/b/a/c/a/f/n$d;->e:Lc/b/a/c/a/f/n;

    invoke-virtual {v0}, Lc/b/a/c/a/f/n;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc/b/a/c/a/f/n$d;->e:Lc/b/a/c/a/f/n;

    iget-object v0, p0, Lc/b/a/c/a/f/n$d;->d:Landroid/os/IBinder;

    invoke-virtual {p1, v0}, Lc/b/a/c/a/f/n;->d(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    invoke-static {p1, v0}, Lc/b/a/c/a/f/n;->e(Lc/b/a/c/a/f/n;Landroid/os/IInterface;)Landroid/os/IInterface;

    iget-object p1, p0, Lc/b/a/c/a/f/n$d;->e:Lc/b/a/c/a/f/n;

    invoke-static {p1}, Lc/b/a/c/a/f/n;->r(Lc/b/a/c/a/f/n;)Landroid/os/IInterface;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc/b/a/c/a/f/n$d;->e:Lc/b/a/c/a/f/n;

    invoke-virtual {p1}, Lc/b/a/c/a/f/n;->u()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :cond_1
    iget-object p1, p0, Lc/b/a/c/a/f/n$d;->e:Lc/b/a/c/a/f/n;

    invoke-static {p1}, Lc/b/a/c/a/f/n;->s(Lc/b/a/c/a/f/n;)V

    iget-object p1, p0, Lc/b/a/c/a/f/n$d;->e:Lc/b/a/c/a/f/n;

    sget-object v0, Lc/b/a/c/a/b;->c:Lc/b/a/c/a/b;

    invoke-virtual {p1, v0}, Lc/b/a/c/a/f/n;->i(Lc/b/a/c/a/b;)V

    :cond_2
    :goto_0
    return-void
.end method
