.class public Lc/c/a/a/b/i;
.super Lc/c/a/a/b/f;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc/c/a/a/b/f;-><init>()V

    const/high16 v0, 0x41f00000    # 30.0f

    invoke-virtual {p0, v0}, Lc/c/a/a/b/i;->h(F)V

    return-void
.end method


# virtual methods
.method public h(F)V
    .locals 0

    invoke-super {p0, p1}, Lc/c/a/a/b/f;->h(F)V

    return-void
.end method
