.class public Lc/a/c/p;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/c/p$a;,
        Lc/a/c/p$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final b:Lc/a/c/b$a;

.field public final c:Lc/a/c/u;

.field public d:Z


# direct methods
.method private constructor <init>(Lc/a/c/u;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc/a/c/p;->d:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lc/a/c/p;->a:Ljava/lang/Object;

    iput-object v0, p0, Lc/a/c/p;->b:Lc/a/c/b$a;

    iput-object p1, p0, Lc/a/c/p;->c:Lc/a/c/u;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lc/a/c/b$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lc/a/c/b$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc/a/c/p;->d:Z

    iput-object p1, p0, Lc/a/c/p;->a:Ljava/lang/Object;

    iput-object p2, p0, Lc/a/c/p;->b:Lc/a/c/b$a;

    const/4 p1, 0x0

    iput-object p1, p0, Lc/a/c/p;->c:Lc/a/c/u;

    return-void
.end method

.method public static a(Lc/a/c/u;)Lc/a/c/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/c/u;",
            ")",
            "Lc/a/c/p<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lc/a/c/p;

    invoke-direct {v0, p0}, Lc/a/c/p;-><init>(Lc/a/c/u;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Object;Lc/a/c/b$a;)Lc/a/c/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lc/a/c/b$a;",
            ")",
            "Lc/a/c/p<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lc/a/c/p;

    invoke-direct {v0, p0, p1}, Lc/a/c/p;-><init>(Ljava/lang/Object;Lc/a/c/b$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-object v0, p0, Lc/a/c/p;->c:Lc/a/c/u;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
