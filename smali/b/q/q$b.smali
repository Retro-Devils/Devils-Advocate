.class Lb/q/q$b;
.super Lb/q/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/q/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Lb/q/q;


# direct methods
.method constructor <init>(Lb/q/q;)V
    .locals 0

    invoke-direct {p0}, Lb/q/n;-><init>()V

    iput-object p1, p0, Lb/q/q$b;->a:Lb/q/q;

    return-void
.end method


# virtual methods
.method public c(Lb/q/m;)V
    .locals 1

    iget-object p1, p0, Lb/q/q$b;->a:Lb/q/q;

    iget-boolean v0, p1, Lb/q/q;->O:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lb/q/m;->a0()V

    iget-object p1, p0, Lb/q/q$b;->a:Lb/q/q;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lb/q/q;->O:Z

    :cond_0
    return-void
.end method

.method public e(Lb/q/m;)V
    .locals 2

    iget-object v0, p0, Lb/q/q$b;->a:Lb/q/q;

    iget v1, v0, Lb/q/q;->N:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lb/q/q;->N:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lb/q/q;->O:Z

    invoke-virtual {v0}, Lb/q/m;->p()V

    :cond_0
    invoke-virtual {p1, p0}, Lb/q/m;->P(Lb/q/m$f;)Lb/q/m;

    return-void
.end method
