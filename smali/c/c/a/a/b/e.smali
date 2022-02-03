.class public Lc/c/a/a/b/e;
.super Lc/c/a/a/b/f;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc/c/a/a/b/f;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lc/c/a/a/b/e;->f(F)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lc/c/a/a/b/e;->g(F)V

    return-void
.end method


# virtual methods
.method public f(F)V
    .locals 0

    invoke-super {p0, p1}, Lc/c/a/a/b/f;->f(F)V

    return-void
.end method

.method public g(F)V
    .locals 0

    invoke-super {p0, p1}, Lc/c/a/a/b/f;->g(F)V

    return-void
.end method
