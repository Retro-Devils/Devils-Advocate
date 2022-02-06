.class Lcom/digdroid/alman/dig/d0$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0;->C(Landroid/app/Activity;IZILjava/lang/String;Lcom/digdroid/alman/dig/d0$r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:I

.field final synthetic d:Z

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:I

.field final synthetic g:Lcom/digdroid/alman/dig/d0$r;

.field final synthetic h:Lcom/digdroid/alman/dig/d0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;IZLjava/lang/String;ILcom/digdroid/alman/dig/d0$r;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$i;->h:Lcom/digdroid/alman/dig/d0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/d0$i;->b:Landroid/app/Activity;

    iput p3, p0, Lcom/digdroid/alman/dig/d0$i;->c:I

    iput-boolean p4, p0, Lcom/digdroid/alman/dig/d0$i;->d:Z

    iput-object p5, p0, Lcom/digdroid/alman/dig/d0$i;->e:Ljava/lang/String;

    iput p6, p0, Lcom/digdroid/alman/dig/d0$i;->f:I

    iput-object p7, p0, Lcom/digdroid/alman/dig/d0$i;->g:Lcom/digdroid/alman/dig/d0$r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$i;->h:Lcom/digdroid/alman/dig/d0;

    iget-object p2, p0, Lcom/digdroid/alman/dig/d0$i;->b:Landroid/app/Activity;

    iget v0, p0, Lcom/digdroid/alman/dig/d0$i;->c:I

    new-instance v1, Lcom/digdroid/alman/dig/d0$i$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/d0$i$a;-><init>(Lcom/digdroid/alman/dig/d0$i;)V

    invoke-virtual {p1, p2, v0, v1}, Lcom/digdroid/alman/dig/d0;->B(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    return-void
.end method
