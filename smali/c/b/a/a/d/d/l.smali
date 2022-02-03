.class final Lc/b/a/a/d/d/l;
.super Lc/b/a/a/d/d/d;
.source ""


# instance fields
.field private final synthetic a:Lc/b/a/a/d/d/j$b;


# direct methods
.method constructor <init>(Lc/b/a/a/d/d/j$b;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/d/d/l;->a:Lc/b/a/a/d/d/j$b;

    invoke-direct {p0}, Lc/b/a/a/d/d/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final L(Lcom/google/android/gms/common/api/Status;Lc/b/a/a/e/f;)V
    .locals 2

    iget-object v0, p0, Lc/b/a/a/d/d/l;->a:Lc/b/a/a/d/d/j$b;

    new-instance v1, Lc/b/a/a/d/d/j$a;

    invoke-direct {v1, p1, p2}, Lc/b/a/a/d/d/j$a;-><init>(Lcom/google/android/gms/common/api/Status;Lc/b/a/a/e/f;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f(Lcom/google/android/gms/common/api/k;)V

    return-void
.end method
