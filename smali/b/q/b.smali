.class public Lb/q/b;
.super Lb/q/q;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb/q/q;-><init>()V

    invoke-direct {p0}, Lb/q/b;->p0()V

    return-void
.end method

.method private p0()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lb/q/q;->m0(I)Lb/q/q;

    new-instance v1, Lb/q/d;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lb/q/d;-><init>(I)V

    invoke-virtual {p0, v1}, Lb/q/q;->e0(Lb/q/m;)Lb/q/q;

    move-result-object v1

    new-instance v2, Lb/q/c;

    invoke-direct {v2}, Lb/q/c;-><init>()V

    invoke-virtual {v1, v2}, Lb/q/q;->e0(Lb/q/m;)Lb/q/q;

    move-result-object v1

    new-instance v2, Lb/q/d;

    invoke-direct {v2, v0}, Lb/q/d;-><init>(I)V

    invoke-virtual {v1, v2}, Lb/q/q;->e0(Lb/q/m;)Lb/q/q;

    return-void
.end method
