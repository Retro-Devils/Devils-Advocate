.class final Lc/b/a/a/d/c/l;
.super Lc/b/a/a/d/c/d;
.source ""


# instance fields
.field private final synthetic a:Lc/b/a/a/d/c/j$b;


# direct methods
.method constructor <init>(Lc/b/a/a/d/c/j$b;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/d/c/l;->a:Lc/b/a/a/d/c/j$b;

    invoke-direct {p0}, Lc/b/a/a/d/c/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final J(Lcom/google/android/gms/common/api/Status;Lc/b/a/a/e/f;)V
    .locals 2

    iget-object v0, p0, Lc/b/a/a/d/c/l;->a:Lc/b/a/a/d/c/j$b;

    new-instance v1, Lc/b/a/a/d/c/j$a;

    invoke-direct {v1, p1, p2}, Lc/b/a/a/d/c/j$a;-><init>(Lcom/google/android/gms/common/api/Status;Lc/b/a/a/e/f;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f(Lcom/google/android/gms/common/api/k;)V

    return-void
.end method
