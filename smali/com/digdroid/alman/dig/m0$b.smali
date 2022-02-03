.class Lcom/digdroid/alman/dig/m0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnMultiChoiceClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Z

.field final synthetic b:Lcom/digdroid/alman/dig/m0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0;[Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$b;->b:Lcom/digdroid/alman/dig/m0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/m0$b;->a:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;IZ)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$b;->a:[Z

    aput-boolean p3, p1, p2

    return-void
.end method
