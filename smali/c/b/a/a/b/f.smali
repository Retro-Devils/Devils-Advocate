.class public final Lc/b/a/a/b/f;
.super Lc/b/a/a/b/g;
.source ""


# static fields
.field public static final d:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lc/b/a/a/b/g;->a:I

    sput v0, Lc/b/a/a/b/f;->d:I

    return-void
.end method

.method public static b(Landroid/content/Context;)Landroid/content/res/Resources;
    .locals 0

    invoke-static {p0}, Lc/b/a/a/b/g;->b(Landroid/content/Context;)Landroid/content/res/Resources;

    move-result-object p0

    return-object p0
.end method
