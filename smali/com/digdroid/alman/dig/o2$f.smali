.class Lcom/digdroid/alman/dig/o2$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o2;->x1(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/o2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o2$f;->a:Lcom/digdroid/alman/dig/o2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$f;->a:Lcom/digdroid/alman/dig/o2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->i1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p1;->U2()V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
