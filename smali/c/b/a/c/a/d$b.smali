.class final Lc/b/a/c/a/d$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/c/a/e$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/c/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lc/b/a/c/a/d;


# direct methods
.method private constructor <init>(Lc/b/a/c/a/d;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/c/a/d$b;->a:Lc/b/a/c/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/b/a/c/a/d;Lc/b/a/c/a/d$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/b/a/c/a/d$b;-><init>(Lc/b/a/c/a/d;)V

    return-void
.end method


# virtual methods
.method public final a(Lc/b/a/c/a/e;)V
    .locals 0

    return-void
.end method
