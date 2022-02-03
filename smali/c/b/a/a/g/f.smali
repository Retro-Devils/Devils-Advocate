.class public final Lc/b/a/a/g/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/b/a/a/g/f$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field static final b:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/b/a/a/g/f$a;

    invoke-direct {v0}, Lc/b/a/a/g/f$a;-><init>()V

    sput-object v0, Lc/b/a/a/g/f;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lc/b/a/a/g/m;

    invoke-direct {v0}, Lc/b/a/a/g/m;-><init>()V

    sput-object v0, Lc/b/a/a/g/f;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
