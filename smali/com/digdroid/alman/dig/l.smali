.class public Lcom/digdroid/alman/dig/l;
.super Lcom/digdroid/alman/dig/x3;
.source ""

# interfaces
.implements Lcom/jaredrummler/android/colorpicker/d;


# instance fields
.field L:Lcom/digdroid/alman/dig/g2$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/digdroid/alman/dig/x3;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/l;->L:Lcom/digdroid/alman/dig/g2$b;

    return-void
.end method


# virtual methods
.method public n0(I)V
    .locals 0

    return-void
.end method

.method public w0(II)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/l;->L:Lcom/digdroid/alman/dig/g2$b;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/digdroid/alman/dig/g2$b;->a(I)V

    :cond_0
    return-void
.end method
