.class public final Lc/b/a/c/a/f/c;
.super Lc/b/a/c/a/f/a;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc/b/a/c/a/f/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/content/Context;Ljava/lang/String;Lc/b/a/c/a/f/p$a;Lc/b/a/c/a/f/p$b;)Lc/b/a/c/a/f/d;
    .locals 8

    new-instance v7, Lc/b/a/c/a/f/l;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lc/b/a/c/a/f/v;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lc/b/a/c/a/f/l;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc/b/a/c/a/f/p$a;Lc/b/a/c/a/f/p$b;)V

    return-object v7
.end method

.method public final c(Landroid/app/Activity;Lc/b/a/c/a/f/d;Z)Lc/b/a/c/a/f/f;
    .locals 0

    invoke-interface {p2}, Lc/b/a/c/a/f/d;->a()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p1, p2, p3}, Lc/b/a/c/a/f/s;->c(Landroid/app/Activity;Landroid/os/IBinder;Z)Lc/b/a/c/a/f/f;

    move-result-object p1

    return-object p1
.end method
